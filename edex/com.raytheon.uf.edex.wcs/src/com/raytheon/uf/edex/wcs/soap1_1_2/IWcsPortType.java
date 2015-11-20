/**
 * Copyright 09/24/12 Raytheon Company.
 *
 * Unlimited Rights
 * This software was developed pursuant to Contract Number 
 * DTFAWA-10-D-00028 with the US Government. The US Government’s rights 
 * in and to this copyrighted software are as specified in DFARS
 * 252.227-7014 which was made part of the above contract. 
 */

package com.raytheon.uf.edex.wcs.soap1_1_2;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

import net.opengis.wcs.v_1_1_2.Capabilities;
import net.opengis.wcs.v_1_1_2.CoverageDescriptions;
import net.opengis.wcs.v_1_1_2.CoveragesType;
import net.opengis.wcs.v_1_1_2.DescribeCoverage;
import net.opengis.wcs.v_1_1_2.GetCapabilities;
import net.opengis.wcs.v_1_1_2.GetCoverage;

import com.raytheon.uf.edex.ogc.common.soap.ServiceExceptionReport;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.6 in JDK 6 Generated
 * source version: 2.1
 * 
 */
@WebService(name = "WcsPortType", targetNamespace = "http://wcs.edex.uf.raytheon.com")
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface IWcsPortType {

    /**
     * 
     * @param body
     * @return returns net.opengis.wcs._1.Capabilities
     * @throws ServiceExceptionReport
     */
    @WebMethod(operationName = "GetCapabilitiesOperation")
    @WebResult(name = "Capabilities", targetNamespace = "http://www.opengis.net/wcs/1.1", partName = "Body")
    public Capabilities getCapabilitiesOperation(
            @WebParam(name = "GetCapabilities", targetNamespace = "http://www.opengis.net/wcs/1.1", partName = "Body") GetCapabilities body)
            throws ServiceExceptionReport;

    /**
     * 
     * @param body
     * @return returns net.opengis.wcs._1.CoverageDescriptions
     * @throws ServiceExceptionReport
     */
    @WebMethod(operationName = "DescribeCoverageOperation")
    @WebResult(name = "CoverageDescriptions", targetNamespace = "http://www.opengis.net/wcs/1.1", partName = "Body")
    public CoverageDescriptions describeCoverageOperation(
            @WebParam(name = "DescribeCoverage", targetNamespace = "http://www.opengis.net/wcs/1.1", partName = "Body") DescribeCoverage body)
            throws ServiceExceptionReport;

    /**
     * @param body
     * @param response
     * @param coverageData
     * @throws ServiceExceptionReport
     */
    @WebMethod(operationName = "GetCoverageOperation")
    @WebResult(name = "Coverages", targetNamespace = "http://www.opengis.net/wcs/1.1", partName = "Body")
    public CoveragesType getCoverageOperation(
            @WebParam(name = "GetCoverage", targetNamespace = "http://www.opengis.net/wcs/1.1", partName = "Body") GetCoverage body)
            throws ServiceExceptionReport;

}
