/*
 * Copyright 2017 StreamSets Inc.
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
package com.streamsets.datacollector.config;

import com.streamsets.pipeline.api.Label;

public enum PipelineGroups implements Label {
  CLUSTER("Cluster"),
  PARAMETERS("Parameters"),
  NOTIFICATIONS("Notifications"),
  BAD_RECORDS("Error Records"),
  STATS("Statistics"),
  EMR("EMR"),
  BOOTSTRAP_ACTIONS("Bootstrap Actions"),
  DATAPROC("Dataproc"),
  ADVANCED("Advanced"),
  ;

  // this is the EMR tab, only to still be used by SDC
  public static final String EMR_GROUP_NAME = "EMR";
  // this is the Cluster tab, which is the consolidated place for cluster configurations in Transformer
  public static final String CLUSTER_GROUP_NAME = "CLUSTER";

  public static final String BOOTSTRAP_ACTIONS_NAME = "BOOTSTRAP_ACTIONS";

  private final String label;

  PipelineGroups(String label) {
    this.label = label;
  }

  @Override
  public String getLabel() {
    return label;
  }
}
