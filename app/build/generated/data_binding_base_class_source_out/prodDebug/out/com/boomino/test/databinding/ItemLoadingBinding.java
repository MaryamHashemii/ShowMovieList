// Generated by data binding compiler. Do not edit!
package com.boomino.test.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.boomino.test.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemLoadingBinding extends ViewDataBinding {
  @NonNull
  public final ProgressBar progressBar;

  protected ItemLoadingBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ProgressBar progressBar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.progressBar = progressBar;
  }

  @NonNull
  public static ItemLoadingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_loading, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemLoadingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemLoadingBinding>inflateInternal(inflater, R.layout.item_loading, root, attachToRoot, component);
  }

  @NonNull
  public static ItemLoadingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_loading, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemLoadingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemLoadingBinding>inflateInternal(inflater, R.layout.item_loading, null, false, component);
  }

  public static ItemLoadingBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemLoadingBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemLoadingBinding)bind(component, view, R.layout.item_loading);
  }
}
