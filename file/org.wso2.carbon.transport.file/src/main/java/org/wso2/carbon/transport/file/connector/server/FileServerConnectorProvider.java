/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.transport.file.connector.server;

import org.osgi.service.component.annotations.Component;
import org.wso2.carbon.messaging.ServerConnector;
import org.wso2.carbon.messaging.ServerConnectorProvider;
import org.wso2.carbon.transport.file.connector.server.util.Constants;

import java.util.List;
import java.util.Map;

/**
 * Server connector provider for File transport.
 */
@Component(
        name = "org.wso2.carbon.transport.file.connector.server.FileServerConnectorProvider",
        immediate = true,
        service = ServerConnectorProvider.class
)
public class FileServerConnectorProvider extends ServerConnectorProvider {
    public FileServerConnectorProvider(String protocol) {
        super(protocol);
    }

    public FileServerConnectorProvider() {
        super(Constants.PROTOCOL_NAME);
    }

    @Override
    public List<ServerConnector> initializeConnectors() {
        return null;
    }

    @Override
    public ServerConnector createConnector(String id, Map<String, String> properties) {
        return new FileServerConnector(id, properties);
    }
}
