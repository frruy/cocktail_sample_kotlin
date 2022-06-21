// Generated by data binding compiler. Do not edit!
package com.well.designsystem.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.well.designsystem.R;
import com.well.designsystem.view.CustomTextView;
import com.well.designsystem.view.button.WellButton;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class DialogConfirmationBinding extends ViewDataBinding {
  @NonNull
  public final WellButton tvCancel;

  @NonNull
  public final WellButton tvConfirm;

  @NonNull
  public final CustomTextView tvDes;

  @NonNull
  public final CustomTextView tvTitle;

  protected DialogConfirmationBinding(Object _bindingComponent, View _root, int _localFieldCount,
      WellButton tvCancel, WellButton tvConfirm, CustomTextView tvDes, CustomTextView tvTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.tvCancel = tvCancel;
    this.tvConfirm = tvConfirm;
    this.tvDes = tvDes;
    this.tvTitle = tvTitle;
  }

  @NonNull
  public static DialogConfirmationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_confirmation, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DialogConfirmationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DialogConfirmationBinding>inflateInternal(inflater, R.layout.dialog_confirmation, root, attachToRoot, component);
  }

  @NonNull
  public static DialogConfirmationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_confirmation, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DialogConfirmationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DialogConfirmationBinding>inflateInternal(inflater, R.layout.dialog_confirmation, null, false, component);
  }

  public static DialogConfirmationBinding bind(@NonNull View view) {
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
  public static DialogConfirmationBinding bind(@NonNull View view, @Nullable Object component) {
    return (DialogConfirmationBinding)bind(component, view, R.layout.dialog_confirmation);
  }
}
