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
package com.streamsets.pipeline.kafka.impl;

import com.streamsets.pipeline.kafka.api.ConsumerFactorySettings;
import com.streamsets.pipeline.kafka.api.SdcKafkaConsumer;
import com.streamsets.pipeline.kafka.api.SdcKafkaConsumerFactory;

public class Kafka08ConsumerFactory extends SdcKafkaConsumerFactory {

  private ConsumerFactorySettings settings;

  public Kafka08ConsumerFactory() {
  }

  @Override
  protected void init(ConsumerFactorySettings settings) {
    this.settings = settings;
  }

  @Override
  public SdcKafkaConsumer create() {
    return new KafkaConsumer08(
        settings.getZookeeperConnect(),
        settings.getTopic(),
        settings.getConsumerGroup(),
        settings.getMaxWaitTime(),
        settings.getKafkaConsumerConfigs(),
        settings.getContext(),
        settings.getKafkaAutoOffsetReset(),
        settings.getOverrideConfigurations()
    );
  }
}
