/*
 * Copyright 2010 frickelbude.de
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package de.frickelbude.wicket;

/**
 * A static utility class for String operations.
 * 
 * @author Ole Langbehn (ole.langbehn@googlemail.com) (initial creation)
 */
public class Strings {

    /**
     * Hide constructor.
     */
    private Strings() {
        // construction is superfluous
    }

    /**
     * Joins the elements of the provided array into a single String containing
     * the provided list of elements separated by the separator character.
     */
    public static String join( final Object[] array, final char separator ) {
        if ( array == null || array.length <= 0 ) {
            return "";
        }

        final StringBuilder sb = new StringBuilder( 128 );

        boolean appendSeparator = false;
        for ( final Object object : array ) {
            if ( appendSeparator ) {
                sb.append( separator );
            } else {
                appendSeparator = true;
            }
            sb.append( object );

        }

        return sb.toString();
    }

}
