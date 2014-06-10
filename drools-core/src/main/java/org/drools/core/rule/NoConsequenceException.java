/*
 * Copyright 2005 JBoss Inc
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

package org.drools.core.rule;

import org.drools.core.definitions.rule.impl.RuleImpl;

/**
 * Validity exception indicating that a <code>Rule</code> does not contain a
 * <code>Consequence</code>s.
 */
public class NoConsequenceException extends InvalidRuleException {
    // ------------------------------------------------------------
    // Constructors
    // ------------------------------------------------------------

    private static final long serialVersionUID = 510l;

    /**
     * Construct.
     * 
     * @param rule
     *            The invalid <code>Rule</code>.
     */
    public NoConsequenceException(final RuleImpl rule) {
        super( rule );
    }
}