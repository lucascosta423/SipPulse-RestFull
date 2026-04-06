package com.sippulse.soapadapter.config.soap.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * SipPulse-RestFull
 * Copyright (C) 2026
 * <p>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <a href="https://www.gnu.org/licenses/">gnu</a>.
 */


@Configuration
@ConfigurationProperties(prefix = "soap")
public class SoapProperties {

    private Endpoints endpoints = new Endpoints();

    public Endpoints getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(Endpoints endpoints) {
        this.endpoints = endpoints;
    }

    public static class Endpoints {

        private String domain;
        private String profile;
        private String subscriber;
        private String did;
        private String whitelist;
        private String ratePlan;
        private String rate;
        private String accountGroup;
        private String customer;
        private String userLocation;
        private String address;
        private String huntGroup;
        private String reloadModule;

        // getters e setters

        public String getDomain() { return domain; }
        public void setDomain(String domain) { this.domain = domain; }

        public String getProfile() { return profile; }
        public void setProfile(String profile) { this.profile = profile; }

        public String getSubscriber() { return subscriber; }
        public void setSubscriber(String subscriber) { this.subscriber = subscriber; }

        public String getDid() { return did; }
        public void setDid(String did) { this.did = did; }

        public String getWhitelist() { return whitelist; }
        public void setWhitelist(String whitelist) { this.whitelist = whitelist; }

        public String getRatePlan() { return ratePlan; }
        public void setRatePlan(String ratePlan) { this.ratePlan = ratePlan; }

        public String getRate() { return rate; }
        public void setRate(String rate) { this.rate = rate; }

        public String getAccountGroup() { return accountGroup; }
        public void setAccountGroup(String accountGroup) { this.accountGroup = accountGroup; }

        public String getCustomer() { return customer; }
        public void setCustomer(String customer) { this.customer = customer; }

        public String getUserLocation() { return userLocation; }
        public void setUserLocation(String userLocation) { this.userLocation = userLocation; }

        public String getAddress() { return address; }
        public void setAddress(String address) { this.address = address; }

        public String getHuntGroup() { return huntGroup; }
        public void setHuntGroup(String huntGroup) { this.huntGroup = huntGroup; }

        public String getReloadModule() { return reloadModule; }
        public void setReloadModule(String reloadModule) { this.reloadModule = reloadModule; }
    }
}
