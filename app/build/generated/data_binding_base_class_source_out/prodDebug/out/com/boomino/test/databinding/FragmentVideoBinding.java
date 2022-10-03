// Generated by data binding compiler. Do not edit!
package com.boomino.test.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.boomino.test.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentVideoBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton btnSearch;

  @NonNull
  public final AppCompatEditText edtSearch;

  @NonNull
  public final ProgressBar progress;

  @NonNull
  public final RecyclerView rvCategories;

  @NonNull
  public final RecyclerView rvVideos;

  protected FragmentVideoBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatButton btnSearch, AppCompatEditText edtSearch, ProgressBar progress,
      RecyclerView rvCategories, RecyclerView rvVideos) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnSearch = btnSearch;
    this.edtSearch = edtSearch;
    this.progress = progress;
    this.rvCategories = rvCategories;
    this.rvVideos = rvVideos;
  }

  @NonNull
  public static FragmentVideoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_video, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentVideoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentVideoBinding>inflateInternal(inflater, R.layout.fragment_video, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentVideoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_video, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentVideoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentVideoBinding>inflateInternal(inflater, R.layout.fragment_video, null, false, component);
  }

  public static FragmentVideoBinding bind(@NonNull View view) {
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
  public static FragmentVideoBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentVideoBinding)bind(component, view, R.layout.fragment_video);
  }
}
