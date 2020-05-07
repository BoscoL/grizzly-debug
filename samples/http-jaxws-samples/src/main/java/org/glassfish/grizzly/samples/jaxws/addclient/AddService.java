/*
 * Copyright (c) 2011, 2017 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package org.glassfish.grizzly.samples.jaxws.addclient;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2-hudson-752-
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AddService", targetNamespace = "http://service.jaxws.samples.grizzly.glassfish.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AddService {


    /**
     * 
     * @param value1
     * @param value2
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://service.jaxws.samples.grizzly.glassfish.org/", className = "org.glassfish.grizzly.samples.jaxws.addclient.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://service.jaxws.samples.grizzly.glassfish.org/", className = "org.glassfish.grizzly.samples.jaxws.addclient.AddResponse")
    int add(
            @WebParam(name = "value1", targetNamespace = "")
            int value1,
            @WebParam(name = "value2", targetNamespace = "")
            int value2);

}
