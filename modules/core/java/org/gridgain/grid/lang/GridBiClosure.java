/* 
 Copyright (C) GridGain Systems. All Rights Reserved.
 
 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0
 
 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

/*  _________        _____ __________________        _____
 *  __  ____/___________(_)______  /__  ____/______ ____(_)_______
 *  _  / __  __  ___/__  / _  __  / _  / __  _  __ `/__  / __  __ \
 *  / /_/ /  _  /    _  /  / /_/ /  / /_/ /  / /_/ / _  /  _  / / /
 *  \____/   /_/     /_/   \_,__/   \____/   \__,_/  /_/   /_/ /_/
 */

package org.gridgain.grid.lang;

import org.gridgain.grid.util.lang.*;

/**
 * Defines generic closure with two parameters. Bi-Closure is a simple executable which
 * accepts two parameters and returns a value.
 *
 * @param <E1> Type of the first parameter.
 * @param <E2> Type of the second parameter.
 * @param <R> Type of the closure's return value.
 */
public abstract class GridBiClosure<E1, E2, R> extends GridLambdaAdapter {
    /**
     * Closure body.
     *
     * @param e1 First parameter.
     * @param e2 Second parameter.
     * @return Closure return value.
     */
    public abstract R apply(E1 e1, E2 e2);
}
