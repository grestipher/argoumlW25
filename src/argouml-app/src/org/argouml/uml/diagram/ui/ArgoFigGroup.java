// $Id$
// Copyright (c) 2007-2008 The Regents of the University of California. All
// Rights Reserved. Permission to use, copy, modify, and distribute this
// software and its documentation without fee, and without a written
// agreement is hereby granted, provided that the above copyright notice
// and this paragraph appear in all copies. This software program and
// documentation are copyrighted by The Regents of the University of
// California. The software program and documentation are supplied "AS
// IS", without any accompanying services from The Regents. The Regents
// does not warrant that the operation of the program will be
// uninterrupted or error-free. The end-user understands that the program
// was developed for research purposes and is advised not to rely
// exclusively on the program for any reason. IN NO EVENT SHALL THE
// UNIVERSITY OF CALIFORNIA BE LIABLE TO ANY PARTY FOR DIRECT, INDIRECT,
// SPECIAL, INCIDENTAL, OR CONSEQUENTIAL DAMAGES, INCLUDING LOST PROFITS,
// ARISING OUT OF THE USE OF THIS SOFTWARE AND ITS DOCUMENTATION, EVEN IF
// THE UNIVERSITY OF CALIFORNIA HAS BEEN ADVISED OF THE POSSIBILITY OF
// SUCH DAMAGE. THE UNIVERSITY OF CALIFORNIA SPECIFICALLY DISCLAIMS ANY
// WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
// MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE. THE SOFTWARE
// PROVIDED HEREUNDER IS ON AN "AS IS" BASIS, AND THE UNIVERSITY OF
// CALIFORNIA HAS NO OBLIGATIONS TO PROVIDE MAINTENANCE, SUPPORT,
// UPDATES, ENHANCEMENTS, OR MODIFICATIONS.

package org.argouml.uml.diagram.ui;

import java.util.List;

import org.argouml.kernel.Project;
import org.tigris.gef.presentation.FigGroup;

/**
 * A Fig which contains other Figs.  ArgoUMLs version of GEF's FigGroup. <p>
 * 
 * It implements the additional methods of the ArgoFig interface, which is 
 * currently just a helper to figure out which project the Fig belongs to
 * (based on the GraphModel that contains it).t belongs to. 
 * 
 * @author Tom Morris <tfmorris@gmail.com>
 */
public abstract class ArgoFigGroup extends FigGroup implements ArgoFig {

    /**
     * The constructor. Create a FigGroup that knows about its Project.
     */
    public ArgoFigGroup() {
        super();
    }

    /**
     * The constructor. Create a FigGroup that knows about its Project.
     * @param arg0 the Figs that make up the Group
     */
    public ArgoFigGroup(List arg0) {
        super(arg0);
    }

    /**
     * This optional method is not implemented.  It will throw an
     * {@link UnsupportedOperationException} if used.  Figs are 
     * added to a GraphModel which is, in turn, owned by a project.<p>
     * 
     * @param project the project
     * @deprecated
     */
    @SuppressWarnings("deprecation")
    @Deprecated
    public void setProject(Project project) {
        throw new UnsupportedOperationException();
    }
    
    /**
     * This method is identical to the one in FigNodeModelElement.
     * 
     * @return the project 
     * @see org.argouml.uml.diagram.ui.ArgoFig#getProject()
     */
    public Project getProject() {
        return ArgoFigUtil.getProject(this);
    }

}
