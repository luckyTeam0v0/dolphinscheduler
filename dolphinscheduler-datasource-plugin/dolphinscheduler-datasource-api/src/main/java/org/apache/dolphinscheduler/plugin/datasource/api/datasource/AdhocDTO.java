/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.dolphinscheduler.plugin.datasource.api.datasource;

import org.apache.dolphinscheduler.plugin.datasource.api.datasource.clickhouse.ClickHouseDatasourceParamDTO;
import org.apache.dolphinscheduler.plugin.datasource.api.datasource.db2.Db2DatasourceParamDTO;
import org.apache.dolphinscheduler.plugin.datasource.api.datasource.hive.HiveDataSourceParamDTO;
import org.apache.dolphinscheduler.plugin.datasource.api.datasource.mysql.MysqlDatasourceParamDTO;
import org.apache.dolphinscheduler.plugin.datasource.api.datasource.oracle.OracleDatasourceParamDTO;
import org.apache.dolphinscheduler.plugin.datasource.api.datasource.postgresql.PostgreSqlDatasourceParamDTO;
import org.apache.dolphinscheduler.plugin.datasource.api.datasource.presto.PrestoDatasourceParamDTO;
import org.apache.dolphinscheduler.plugin.datasource.api.datasource.spark.SparkDatasourceParamDTO;
import org.apache.dolphinscheduler.plugin.datasource.api.datasource.sqlserver.SqlServerDatasourceParamDTO;
import org.apache.dolphinscheduler.spi.enums.DbType;

import java.io.Serializable;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

public  class AdhocDTO implements Serializable {
    public AdhocDTO() {
    }

    private Integer id;

    private String sql;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }
}
