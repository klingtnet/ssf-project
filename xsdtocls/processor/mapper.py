"""
Todo: rename this module
"""
from lxml import etree
from model import types
from collections import deque

import logging

def map(tree):
    schema = tree.getroot()
    xsdns = None
    for prefix, ns in schema.nsmap.items():
        if ns == 'http://www.w3.org/2001/XMLSchema':
            xsdns = {'prefix': prefix, 'ns': ns}
    if not xsdns:
        logging.error('XSD namespace is not defined!')
        raise SystemExit('Terminating ...')
    tns = schema.attrib['targetNamespace']
    qualified = True if schema.attrib['elementFormDefault'] == 'qualified' else False
    print('qualified: {}\ntarget-namespace: {}\nnamespaces: {}'.format(qualified, tns, schema.nsmap))
    doc = {}
    doc['attributes'] = [_ for _ in schema.iterchildren(tag='{%s}attribute' % xsdns)]
    doc['elements'] = [_ for _ in schema.iterchildren(tag='{%s}element' % xsdns)]
    doc['complex_types'] = [_ for _ in schema.iterchildren(tag='{%s}complexType' % xsdns)]
    doc['simple_types'] = [_ for _ in schema.iterchildren(tag='{%s}simpleType' % xsdns)]
    #
    for k, v in doc.items():
        logging.debug('{1} {0}'.format(k, len(v)))
    #
    simple_types(doc['simple_types'], tns)

def simple_types(simples, tns):
    for simple in simples:
        if 'name' in simple.attrib.keys():
            name = simple.attrib['name']
            # check for elements
            if len(simple):
                for child in simple:
                    print(child.tag, child.attrib)
            else:
                logging.debug('SimpleType "{}" is empty'.format(name))
        else:
            logging.debug('Nameless SimpleType in "{}"'.format(tns))