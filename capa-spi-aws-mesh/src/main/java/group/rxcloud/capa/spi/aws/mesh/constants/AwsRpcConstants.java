/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package group.rxcloud.capa.spi.aws.mesh.constants;

public interface AwsRpcConstants {

    interface Environments {

        String AWS_RPC_APP_MESH_DEFAULT_PORT = "AWS_RPC_APP_MESH_DEFAULT_PORT";

    }

    interface RpcProperties {

        /**
         * The aws app mesh http url template
         * {serviceId}.svc.cluster.local is virtual service name (https://docs.aws.amazon.com/zh_cn/zh_cn/app-mesh/latest/userguide/virtual_services.html)
         */
        String AWS_APP_MESH_TEMPLATE = "http://{serviceId}.svc.cluster.local:{servicePort}/{operation}";

    }

    interface SerializerProperties {

        String AWS_RPC_APP_MESH_SERIALIZER = "AWS_RPC_APP_MESH_SERIALIZER";

    }
}
