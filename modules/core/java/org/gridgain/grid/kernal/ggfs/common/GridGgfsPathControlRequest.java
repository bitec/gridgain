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

package org.gridgain.grid.kernal.ggfs.common;

import org.gridgain.grid.ggfs.*;
import org.gridgain.grid.util.typedef.internal.*;
import org.jetbrains.annotations.*;

import java.util.*;

/**
 * Single path command message. This is a plain bean.
 *
 * @author @java.author
 * @version @java.version
 */
public class GridGgfsPathControlRequest extends GridGgfsMessage {
    /** Main path. */
    private GridGgfsPath path;

    /** Second path, rename command. */
    private GridGgfsPath destPath;

    /** Boolean flag, meaning depends on command. */
    private boolean flag;

    /** Boolean flag which controls whether file will be colocated on single node. */
    private boolean colocate;

    /** Properties. */
    private Map<String, String> props;

    /** Sequential reads before prefetch. */
    private int seqReadsBeforePrefetch;

    /** Start pos for affinity command. */
    private long start;

    /** Length for affinity code. */
    private long len;

    /** Hadoop replication factor. */
    private int replication;

    /** Hadoop block size. */
    private long blockSize;

    /** Last access time. */
    private long accessTime;

    /** Last modification time. */
    private long modificationTime;

    /**
     * @param path Path.
     */
    public void path(GridGgfsPath path) {
        this.path = path;
    }

    /**
     * @param destPath Destination path (rename only).
     */
    public void destinationPath(GridGgfsPath destPath) {
        this.destPath = destPath;
    }

    /**
     * @param flag Flag value. Meaning depends on command.
     */
    public void flag(boolean flag) {
        this.flag = flag;
    }

    /**
     * @param colocate Colocate control flag value.
     */
    public void colocate(boolean colocate) {
        this.colocate = colocate;
    }

    /**
     * @param replication Hadoop replication factor.
     */
    public void replication(int replication) {
        this.replication = replication;
    }

    /**
     * @param blockSize Hadoop block size.
     */
    public void blockSize(long blockSize) {
        this.blockSize = blockSize;
    }

    /**
     * @param props Properties map.
     */
    public void properties(@Nullable Map<String, String> props) {
        this.props = props;
    }

    /**
     * @param seqReadsBeforePrefetch Sequential reads before prefetch.
     */
    public void sequentialReadsBeforePrefetch(int seqReadsBeforePrefetch) {
        this.seqReadsBeforePrefetch = seqReadsBeforePrefetch;
    }

    /**
     * @param start Start position (affinity command only).
     */
    public void start(long start) {
        this.start = start;
    }

    /**
     * @param len Length (affinity command only).
     */
    public void length(long len) {
        this.len = len;
    }

    /**
     * @param accessTime Last access time.
     */
    public void accessTime(long accessTime) {
        this.accessTime = accessTime;
    }

    /**
     * @param modificationTime Last modification time.
     */
    public void modificationTime(long modificationTime) {
        this.modificationTime = modificationTime;
    }

    /**
     * @return Path.
     */
    public GridGgfsPath path() {
        return path;
    }

    /**
     * @return Destination path (rename only).
     */
    public GridGgfsPath destinationPath() {
        return destPath;
    }

    /**
     * @return Flag value (meaning depends on command).
     */
    public boolean flag() {
        return flag;
    }

    /**
     * @return Colocate control flag value.
     */
    public boolean colocate() {
        return colocate;
    }

    /**
     * @return Hadoop replication factor.
     */
    public int replication() {
        return replication;
    }

    /**
     * @return Hadoop block size.
     */
    public long blockSize() {
        return blockSize;
    }

    /**
     * @return Properties.
     */
    public Map<String, String> properties() {
        return props;
    }

    /**
     * @return Sequential reads before prefetch.
     */
    public int sequentialReadsBeforePrefetch() {
        return seqReadsBeforePrefetch;
    }

    /**
     * @return Start position (affinity command only).
     */
    public long start() {
        return start;
    }

    /**
     * @return Length (affinity command only).
     */
    public long length() {
        return len;
    }

    /**
     * @return Last access time.
     */
    public long accessTime() {
        return accessTime;
    }

    /**
     * @return Last modification time.
     */
    public long modificationTime() {
        return modificationTime;
    }

    /** {@inheritDoc} */
    @Override public String toString() {
        return S.toString(GridGgfsPathControlRequest.class, this, "cmd", command());
    }
}
