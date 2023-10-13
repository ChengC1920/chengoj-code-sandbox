package com.thc.chengoj.judge.codesandbox;

import com.thc.chengoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.thc.chengoj.judge.codesandbox.model.ExecuteCodeResponse;

public interface CodeSandBox {

     ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);

}
