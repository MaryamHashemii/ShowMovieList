// Generated by Dagger (https://dagger.dev).
package com.boomino.test.di.coroutine;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlinx.coroutines.CoroutineDispatcher;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CoroutinesModule_ProvidesDefaultDispatcherFactory implements Factory<CoroutineDispatcher> {
  @Override
  public CoroutineDispatcher get() {
    return providesDefaultDispatcher();
  }

  public static CoroutinesModule_ProvidesDefaultDispatcherFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CoroutineDispatcher providesDefaultDispatcher() {
    return Preconditions.checkNotNullFromProvides(CoroutinesModule.INSTANCE.providesDefaultDispatcher());
  }

  private static final class InstanceHolder {
    private static final CoroutinesModule_ProvidesDefaultDispatcherFactory INSTANCE = new CoroutinesModule_ProvidesDefaultDispatcherFactory();
  }
}
