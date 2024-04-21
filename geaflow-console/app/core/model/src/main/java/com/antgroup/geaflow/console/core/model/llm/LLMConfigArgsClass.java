/*
 * Copyright 2023 AntGroup CO., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */

package com.antgroup.geaflow.console.core.model.llm;

import com.antgroup.geaflow.console.core.model.config.GeaflowConfigClass;
import com.antgroup.geaflow.console.core.model.config.GeaflowConfigKey;
import com.antgroup.geaflow.console.core.model.config.GeaflowConfigValue;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LLMConfigArgsClass extends GeaflowConfigClass {

    @GeaflowConfigKey(value = "retryTimes")
    @GeaflowConfigValue(required = false, defaultValue = "3")
    private Integer retryTimes;
    
    @GeaflowConfigKey(value = "retryInterval")
    @GeaflowConfigValue(required = false, defaultValue = "1")
    private Integer retryInterval;

    @GeaflowConfigKey(value = "connectTimeout")
    @GeaflowConfigValue(required = false, defaultValue = "15")
    private Integer connectTimeout;

    @GeaflowConfigKey(value = "readTimeout")
    @GeaflowConfigValue(required = false, defaultValue = "15")
    private Integer readTimeout;

    @GeaflowConfigKey(value = "writeTimeout")
    @GeaflowConfigValue(required = false, defaultValue = "100")
    private Integer writeTimeout;
    
}
