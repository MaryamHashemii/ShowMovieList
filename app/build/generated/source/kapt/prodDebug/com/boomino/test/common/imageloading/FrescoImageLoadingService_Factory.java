// Generated by Dagger (https://dagger.dev).
package com.boomino.test.common.imageloading;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FrescoImageLoadingService_Factory implements Factory<FrescoImageLoadingService> {
  @Override
  public FrescoImageLoadingService get() {
    return newInstance();
  }

  public static FrescoImageLoadingService_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static FrescoImageLoadingService newInstance() {
    return new FrescoImageLoadingService();
  }

  private static final class InstanceHolder {
    private static final FrescoImageLoadingService_Factory INSTANCE = new FrescoImageLoadingService_Factory();
  }
}
