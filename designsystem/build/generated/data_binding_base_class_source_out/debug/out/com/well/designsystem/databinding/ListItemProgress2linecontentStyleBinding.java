// Generated by data binding compiler. Do not edit!
package com.well.designsystem.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.well.designsystem.R;
import com.well.designsystem.view.CustomTextView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ListItemProgress2linecontentStyleBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView ivEndIcon;

  @NonNull
  public final ProgressBar progressCircular;

  @NonNull
  public final CustomTextView tvDescription;

  @NonNull
  public final CustomTextView tvProgressValue;

  @NonNull
  public final CustomTextView tvTitle;

  @NonNull
  public final LinearLayout viewContent;

  protected ListItemProgress2linecontentStyleBinding(Object _bindingComponent, View _root,
      int _localFieldCount, AppCompatImageView ivEndIcon, ProgressBar progressCircular,
      CustomTextView tvDescription, CustomTextView tvProgressValue, CustomTextView tvTitle,
      LinearLayout viewContent) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ivEndIcon = ivEndIcon;
    this.progressCircular = progressCircular;
    this.tvDescription = tvDescription;
    this.tvProgressValue = tvProgressValue;
    this.tvTitle = tvTitle;
    this.viewContent = viewContent;
  }

  @NonNull
  public static ListItemProgress2linecontentStyleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_progress_2linecontent_style, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ListItemProgress2linecontentStyleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ListItemProgress2linecontentStyleBinding>inflateInternal(inflater, R.layout.list_item_progress_2linecontent_style, root, attachToRoot, component);
  }

  @NonNull
  public static ListItemProgress2linecontentStyleBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_progress_2linecontent_style, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ListItemProgress2linecontentStyleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ListItemProgress2linecontentStyleBinding>inflateInternal(inflater, R.layout.list_item_progress_2linecontent_style, null, false, component);
  }

  public static ListItemProgress2linecontentStyleBinding bind(@NonNull View view) {
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
  public static ListItemProgress2linecontentStyleBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ListItemProgress2linecontentStyleBinding)bind(component, view, R.layout.list_item_progress_2linecontent_style);
  }
}
