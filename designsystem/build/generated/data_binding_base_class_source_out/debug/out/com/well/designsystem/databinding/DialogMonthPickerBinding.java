// Generated by view binder compiler. Do not edit!
package com.well.designsystem.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.well.designsystem.R;
import com.well.designsystem.view.CustomTextView;
import com.well.designsystem.view.bottomsheet.WellBottomSheetHeader;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogMonthPickerBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageButton btnCalendarBack;

  @NonNull
  public final ImageButton btnCalendarNext;

  @NonNull
  public final RecyclerView rvListItem;

  @NonNull
  public final CustomTextView tvYear;

  @NonNull
  public final RelativeLayout viewCalendarControl;

  @NonNull
  public final WellBottomSheetHeader viewHeader;

  private DialogMonthPickerBinding(@NonNull RelativeLayout rootView,
      @NonNull ImageButton btnCalendarBack, @NonNull ImageButton btnCalendarNext,
      @NonNull RecyclerView rvListItem, @NonNull CustomTextView tvYear,
      @NonNull RelativeLayout viewCalendarControl, @NonNull WellBottomSheetHeader viewHeader) {
    this.rootView = rootView;
    this.btnCalendarBack = btnCalendarBack;
    this.btnCalendarNext = btnCalendarNext;
    this.rvListItem = rvListItem;
    this.tvYear = tvYear;
    this.viewCalendarControl = viewCalendarControl;
    this.viewHeader = viewHeader;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogMonthPickerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogMonthPickerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_month_picker, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogMonthPickerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnCalendarBack;
      ImageButton btnCalendarBack = ViewBindings.findChildViewById(rootView, id);
      if (btnCalendarBack == null) {
        break missingId;
      }

      id = R.id.btnCalendarNext;
      ImageButton btnCalendarNext = ViewBindings.findChildViewById(rootView, id);
      if (btnCalendarNext == null) {
        break missingId;
      }

      id = R.id.rvListItem;
      RecyclerView rvListItem = ViewBindings.findChildViewById(rootView, id);
      if (rvListItem == null) {
        break missingId;
      }

      id = R.id.tvYear;
      CustomTextView tvYear = ViewBindings.findChildViewById(rootView, id);
      if (tvYear == null) {
        break missingId;
      }

      id = R.id.viewCalendarControl;
      RelativeLayout viewCalendarControl = ViewBindings.findChildViewById(rootView, id);
      if (viewCalendarControl == null) {
        break missingId;
      }

      id = R.id.viewHeader;
      WellBottomSheetHeader viewHeader = ViewBindings.findChildViewById(rootView, id);
      if (viewHeader == null) {
        break missingId;
      }

      return new DialogMonthPickerBinding((RelativeLayout) rootView, btnCalendarBack,
          btnCalendarNext, rvListItem, tvYear, viewCalendarControl, viewHeader);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}