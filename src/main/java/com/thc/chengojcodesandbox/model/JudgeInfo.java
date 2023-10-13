package com.thc.chengoj.model.dto.questionsubmit;

import lombok.Data;

@Data
public class JudgeInfo {
    /**
     * 时间限制（ms）
     */
    private Long time;

    /**
     * 内存限制（KB）
     */
    private Long memory;

    /**
     *
     */
    private String message;

}
