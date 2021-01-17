package com.example.annotation;

public enum Progress {
    NOT_INVESTIGATED,   // 未調査
    NO_NEED_TO_FIX,     // 対応不要
    NEED_TO_FIX,        // 要修正だが未修正
    FIXED;              // 修正済み
}