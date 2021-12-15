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
package group.rxcloud.capa.spi.aws.mesh.env;

import group.rxcloud.capa.spi.aws.mesh.AwsCapaRpcProperties;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AwsRpcEnvironmentTest {

    @Test
    public void testGetServicePort_SuccessWhenDefault() {
        int servicePort = AwsCapaRpcProperties.AppMeshProperties.Settings.getRpcAwsAppMeshPort();
        Assertions.assertEquals(8080, servicePort);
    }

    @Test
    public void testGetSerializer_SuccessWhenDefault() {
        String serializer = AwsCapaRpcProperties.SerializerProperties.Settings.getRpcAwsAppMeshSerializer();
        Assertions.assertEquals("baiji", serializer);
    }

    @Test
    public void testGetNamespace_SuccessWhenDefault() {
        String namespace = AwsCapaRpcProperties.AppMeshProperties.Settings.getRpcAwsAppMeshNamespace();
        Assertions.assertEquals("meshnamespace", namespace);
    }
}
