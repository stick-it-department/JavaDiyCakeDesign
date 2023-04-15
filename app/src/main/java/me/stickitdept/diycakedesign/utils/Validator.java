package me.stickitdept.diycakedesign.utils;

import android.widget.EditText;

public class Validator {
    public static boolean fieldsAreValid(EditText[] fields) {
        for (EditText field : fields) {
            if (field.getText().toString().isEmpty()) {
                field.setError("Field is required");
                return false;
            }

            field.setError("");
        }

        return true;
    }

    public static void clearFields(EditText[] fields) {
        for (EditText field: fields) {
            field.setText("");
        }
    }
}
