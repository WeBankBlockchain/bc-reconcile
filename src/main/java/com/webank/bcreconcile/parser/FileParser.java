/*
 * Copyright 2014-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.webank.bcreconcile.parser;

import com.webank.bcreconcile.exception.ReconcileException;
import com.webank.bcreconcile.reconcile.ReconcileTransfer;

import java.io.File;
import java.io.IOException;

/**
 * @author wesleywang
 * @Description: FileParser
 * @date 2020/6/17
 */
public interface FileParser {

    void parseAndTransfer(File businessReconFile, File bcReconFile, ReconcileTransfer transfer) throws ReconcileException, IOException;

}