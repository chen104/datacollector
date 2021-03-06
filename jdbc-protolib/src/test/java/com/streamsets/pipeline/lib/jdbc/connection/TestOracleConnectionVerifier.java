/*
 * Copyright 2021 StreamSets Inc.
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

package com.streamsets.pipeline.lib.jdbc.connection;

import com.streamsets.pipeline.api.ConnectionDef;
import com.streamsets.pipeline.api.StageDef;
import org.junit.Assert;
import org.junit.Test;

public class TestOracleConnectionVerifier {

  @Test
  public void testVerifierAndConnectionVersion() {
    StageDef stageDef = OracleConnectionVerifier.class.getAnnotation(StageDef.class);
    ConnectionDef connectionDef = OracleConnection.class.getAnnotation(ConnectionDef.class);
    Assert.assertEquals(stageDef.version(), connectionDef.version());
  }
}
