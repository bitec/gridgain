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

package org.gridgain.grid.kernal.processors.affinity;

import org.gridgain.grid.*;
import org.gridgain.grid.cache.affinity.*;
import org.gridgain.grid.events.*;
import org.jetbrains.annotations.*;

import java.util.*;

/**
 * FIXDOC: Add class description.
 *
 * @author @java.author
 * @version @java.version
 */
public class GridCacheAffinityFunctionContextImpl implements GridCacheAffinityFunctionContext {
    /** Topology snapshot. */
    private List<GridNode> topSnapshot;

    /** Topology version. */
    private long topVer;

    /** Number of backups to assign. */
    private int backups;

    /**
     * @param topSnapshot Topology snapshot.
     * @param topVer Topology version.
     */
    public GridCacheAffinityFunctionContextImpl(List<GridNode> topSnapshot, long topVer, int backups) {
        this.topSnapshot = topSnapshot;
        this.topVer = topVer;
        this.backups = backups;
    }

    /** {@inheritDoc} */
    @Nullable @Override public List<GridNode> previousAssignment(int part) {
        return null;
    }

    /** {@inheritDoc} */
    @Override public List<GridNode> currentTopologySnapshot() {
        return topSnapshot;
    }

    /** {@inheritDoc} */
    @Override public long currentTopologyVersion() {
        return topVer;
    }

    /** {@inheritDoc} */
    @Nullable @Override public GridDiscoveryEvent discoveryEvent() {
        return null;
    }

    /** {@inheritDoc} */
    @Override public int backups() {
        return backups;
    }
}
