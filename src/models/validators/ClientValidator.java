package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Client;

public class ClientValidator {
    public static List<String> validate(Client c) {
        List<String> errors = new ArrayList<String>();

        String company_name_error = _validateTitle(c.getCompany_name());
        if(!company_name_error.equals("")) {
            errors.add(company_name_error);
        }

        String content_error = _validateContent(c.getContent());
        if(!content_error.equals("")) {
            errors.add(content_error);
        }

        return errors;
    }

    private static String _validateTitle(String company_name) {
        if(company_name == null || company_name.equals("")) {
            return "会社名を入力してください。";
        }

        return "";
    }

    private static String _validateContent(String content) {
        if(content == null || content.equals("")) {
            return "内容を入力してください。";
        }

        return "";
    }
}
