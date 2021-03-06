/*
 * Copyright 2014 Adam Dubiel.
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
package org.polyjdbc.core.schema.model;

import org.polyjdbc.core.dialect.Dialect;

public class FloatAttribute extends Attribute {

    public FloatAttribute(Dialect dialect, String name) {
        super(dialect, name);
    }

    @Override
    protected String getTypeDefinition() {
        return dialect().types().floatType();
    }

    public static class FloatAttributeBuilder extends AttributeBuilder<FloatAttributeBuilder, FloatAttribute> {

        private FloatAttributeBuilder(Dialect dialect, String name, RelationBuilder parent) {
            super(new FloatAttribute(dialect, name), parent);
        }

        public static FloatAttributeBuilder floatAttr(Dialect dialect, String name, RelationBuilder parent) {
            return new FloatAttributeBuilder(dialect, name, parent);
        }

        @Override
        protected FloatAttributeBuilder self() {
            return this;
        }
    }
}
