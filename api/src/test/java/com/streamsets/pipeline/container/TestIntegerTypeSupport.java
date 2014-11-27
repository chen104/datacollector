/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.streamsets.pipeline.container;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class TestIntegerTypeSupport {

  @Test
  public void testConvertValid() {
    IntegerTypeSupport support = new IntegerTypeSupport();
    Assert.assertEquals(new Integer(1), support.convert("1"));
    Assert.assertEquals(new Integer(1), support.convert((byte)1));
    Assert.assertEquals(new Integer(1), support.convert((short)1));
    Assert.assertEquals(new Integer(1), support.convert((int)1));
    Assert.assertEquals(new Integer(1), support.convert((long)1));
    Assert.assertEquals(new Integer(1), support.convert((float)1));
    Assert.assertEquals(new Integer(1), support.convert((double)1));
    Assert.assertEquals(new Integer(1), support.convert(new BigDecimal(1)));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testConvertInValid() {
    new IntegerTypeSupport().convert(new Exception());
  }

  @Test
  public void testSnapshot() {
    IntegerTypeSupport ts = new IntegerTypeSupport();
    Integer d = 1;
    Assert.assertSame(d, ts.getReference(d));
  }

}
