/*
 * Copyright 2011 Splunk, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"): you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.splunk;

/**
 * Representation of output server's all-connections.
 */
public class OutputServerAllConnections extends Entity {

    /**
     * Class Constructor.
     *
     * @param service The connected service instance.
     * @param path The output server all-connections endpoint.
     */
    OutputServerAllConnections(Service service, String path) {
        super(service, path);
    }

    /**
     * Returns this connection's destination host name.
     *
     * @return This connection's destination host name.
     */
    public String getDestHost() {
        return getString("destHost");
    }

    /**
     * Returns this connection's destination host IP address.
     *
     * @return This connection's destination host IP address.
     */
    public String getDestIp() {
        return getString("destIp");
    }

    /**
     * Return this connection's destination port.
     *
     * @return This connection's destination port.
     */
    public int getDestPort() {
        return getInteger("destPort");
    }

    /**
     * Returns this connection's source port.
     *
     * @return This connection's source port.
     */
    public int getSourcePort() {
        return getInteger("sourcePort");
    }

    /**
     * Returns this connection's status.
     *
     * @return This connection's status.
     */
    public String getStatus() {
        return getString("status");
    }
}
