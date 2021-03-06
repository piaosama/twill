/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.twill.api.security;

import org.apache.twill.api.SecureStore;

import java.io.IOException;

/**
 * A writer provided to {@link SecureStoreRenewer} for writing out {@link SecureStore} during renewal process.
 */
public interface SecureStoreWriter {

  /**
   * Writes the given {@link SecureStore}.
   *
   * @param secureStore the {@link SecureStore} to persist
   * @throws IOException if failed to write out the {@link SecureStore}
   */
  void write(SecureStore secureStore) throws IOException;
}
