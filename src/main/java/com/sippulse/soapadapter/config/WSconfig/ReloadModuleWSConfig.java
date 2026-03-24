package com.sippulse.soapadapter.config.WSconfig;

import com.sippulse.soapadapter.client.reloadWS.ReloadModulesWS;
import com.sippulse.soapadapter.client.reloadWS.SipPulse;
import com.sippulse.soapadapter.config.soap.SoapProperties;
import com.sippulse.soapadapter.factory.SoapClientFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ReloadModuleWSConfig {

        @Bean
        public ReloadModulesWS reloadModulesWS(SoapProperties properties, SoapClientFactory factory) {
            return factory.createClient(
                    properties.getEndpoints().get("reload_module"),
                    SipPulse::new,
                    SipPulse::getReloadModulesWSPort
            );
        }



}
