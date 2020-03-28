package com.jrg.pdfcc.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

/**
 * The ComponentWithValueCharge
 * 
 * @author Javier RG
 */
@Component
public class ComponentWithValueCharge {

    @Value("${msg.hello}")
    @Getter
    private String mssg;

}
