/*
 * Copyright (c) 2015. Zuercher Hochschule fuer Angewandte Wissenschaften
 *  All Rights Reserved.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License"); you may
 *     not use this file except in compliance with the License. You may obtain
 *     a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *     WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 *     License for the specific language governing permissions and limitations
 *     under the License.
 */

package ch.icclab.cyclops.load.model;

/**
 * @author Manu
 *         Created on 17.11.15.
 */
public class CyclopsSettings {
    private String UDRServiceUrl;
    private String RuleEngine;
    private String RcServiceUrl;

    public CyclopsSettings(String UDRServiceUrl, String ruleEngine, String rcServiceUrl) {
        this.UDRServiceUrl = UDRServiceUrl;
        RuleEngine = ruleEngine;
        RcServiceUrl = rcServiceUrl;
    }

    public String getUDRServiceUrl() {
        return UDRServiceUrl;
    }

    public String getRuleEngine() {
        return RuleEngine;
    }

    public String getRcServiceUrl() {
        return RcServiceUrl;
    }
}
