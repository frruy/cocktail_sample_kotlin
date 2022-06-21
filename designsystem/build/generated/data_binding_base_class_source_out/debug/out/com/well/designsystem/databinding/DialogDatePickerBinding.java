// Generated by view binder compiler. Do not edit!
package com.well.designsystem.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import cn.carbswang.android.numberpickerview.library.NumberPickerView;
import com.well.designsystem.R;
import com.well.designsystem.view.bottomsheet.WellBottomSheetHeader;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogDatePickerBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout layoutChooseNumber;

  @NonNull
  public final NumberPickerView npvNumber1;

  @NonNull
  public final NumberPickerView npvNumber2;

  @NonNull
  public final NumberPickerView npvNumber3;

  @NonNull
  public final WellBottomSheetHeader viewHeader;

  private DialogDatePickerBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout layoutChooseNumber, @NonNull NumberPickerView npvNumber1,
      @NonNull NumberPickerView npvNumber2, @NonNull NumberPickerView npvNumber3,
      @NonNull WellBottomSheetHeader viewHeader) {
    this.rootView = rootView;
    this.layoutChooseNumber = layoutChooseNumber;
    this.npvNumber1 = npvNumber1;
    this.npvNumber2 = npvNumber2;
    this.npvNumber3 = npvNumber3;
    this.viewHeader = viewHeader;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogDatePickerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogDatePickerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_date_picker, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogDatePickerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.layout_choose_number;
      ConstraintLayout layoutChooseNumber = ViewBindings.findChildViewById(rootView, id);
      if (layoutChooseNumber == null) {
        break missingId;
      }

      id = R.id.npv_number1;
      NumberPickerView npvNumber1 = ViewBindings.findChildViewById(rootView, id);
      if (npvNumber1 == null) {
        break missingId;
      }

      id = R.id.npv_number2;
      NumberPickerView npvNumber2 = ViewBindings.findChildViewById(rootView, id);
      if (npvNumber2 == null) {
        break missingId;
      }

      id = R.id.npv_number3;
      NumberPickerView npvNumber3 = ViewBindings.findChildViewById(rootView, id);
      if (npvNumber3 == null) {
        break missingId;
      }

      id = R.id.viewHeader;
      WellBottomSheetHeader viewHeader = ViewBindings.findChildViewById(rootView, id);
      if (viewHeader == null) {
        break missingId;
      }

      return new DialogDatePickerBinding((ConstraintLayout) rootView, layoutChooseNumber,
          npvNumber1, npvNumber2, npvNumber3, viewHeader);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
