// Generated by Dagger (https://dagger.dev).
package com.boomino.test.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideHttpClientFactory implements Factory<OkHttpClient> {
  private final Provider<HttpLoggingInterceptor> httpLoggingInterceptorProvider;

  public NetworkModule_ProvideHttpClientFactory(
      Provider<HttpLoggingInterceptor> httpLoggingInterceptorProvider) {
    this.httpLoggingInterceptorProvider = httpLoggingInterceptorProvider;
  }

  @Override
  public OkHttpClient get() {
    return provideHttpClient(httpLoggingInterceptorProvider.get());
  }

  public static NetworkModule_ProvideHttpClientFactory create(
      Provider<HttpLoggingInterceptor> httpLoggingInterceptorProvider) {
    return new NetworkModule_ProvideHttpClientFactory(httpLoggingInterceptorProvider);
  }

  public static OkHttpClient provideHttpClient(HttpLoggingInterceptor httpLoggingInterceptor) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideHttpClient(httpLoggingInterceptor));
  }
}
