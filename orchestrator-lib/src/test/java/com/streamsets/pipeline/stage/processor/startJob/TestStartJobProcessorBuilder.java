/*
 * Copyright 2020 StreamSets Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.streamsets.pipeline.stage.processor.startJob;

import com.streamsets.pipeline.lib.config.AuthenticationType;
import com.streamsets.pipeline.lib.startJob.JobIdConfig;
import com.streamsets.pipeline.lib.startJob.StartJobConfig;

import java.util.ArrayList;

class TestStartJobProcessorBuilder {

  private StartJobConfig conf = new StartJobConfig();

  TestStartJobProcessorBuilder() {
    conf.jobIdConfigList = new ArrayList<>();
  }

  TestStartJobProcessorBuilder taskName(String taskName) {
    conf.taskName = taskName;
    return this;
  }

  TestStartJobProcessorBuilder baseUrl(String baseUrl) {
    conf.controlHubConfig.baseUrl = baseUrl;
    return this;
  }

  TestStartJobProcessorBuilder jobIdConfig(String jobId, String runtimeParameters) {
    JobIdConfig jobIdConfig = new JobIdConfig();
    jobIdConfig.jobId = jobId;
    jobIdConfig.runtimeParameters = runtimeParameters;
    conf.jobIdConfigList.add(jobIdConfig);
    conf.controlHubConfig.authenticationType = AuthenticationType.USER_PASSWORD;
    return this;
  }

  StartJobProcessor build() {
    return new StartJobProcessor(conf);
  }

}
