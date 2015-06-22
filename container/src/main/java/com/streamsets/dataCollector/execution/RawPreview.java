/**
 * (c) 2015 StreamSets, Inc. All rights reserved. May not
 * be copied, modified, or distributed in whole or part without
 * written consent of StreamSets, Inc.
 */
package com.streamsets.dataCollector.execution;

import java.io.InputStream;

public interface RawPreview {

  public InputStream getData();

  public String getMimeType();

}
