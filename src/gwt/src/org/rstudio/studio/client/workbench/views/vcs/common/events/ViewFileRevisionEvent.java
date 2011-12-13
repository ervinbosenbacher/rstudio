/*
 * ViewFileRevisionEvent.java
 *
 * Copyright (C) 2009-11 by RStudio, Inc.
 *
 * This program is licensed to you under the terms of version 3 of the
 * GNU Affero General Public License. This program is distributed WITHOUT
 * ANY EXPRESS OR IMPLIED WARRANTY, INCLUDING THOSE OF NON-INFRINGEMENT,
 * MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE. Please refer to the
 * AGPL (http://www.gnu.org/licenses/agpl-3.0.txt) for more details.
 *
 */
package org.rstudio.studio.client.workbench.views.vcs.common.events;

import com.google.gwt.event.shared.GwtEvent;

public class ViewFileRevisionEvent extends GwtEvent<ViewFileRevisionHandler>
{  
   public ViewFileRevisionEvent(String revision, String filename)
   {
      revision_ = revision;
      filename_ = filename;
   }

   public String getRevision()
   {
      return revision_;
   }
   
   public String getFilename()
   {
      return filename_;
   }

   @Override
   public Type<ViewFileRevisionHandler> getAssociatedType()
   {
      return TYPE;
   }

   @Override
   protected void dispatch(ViewFileRevisionHandler handler)
   {
      handler.onViewFileRevision(this);
   }

   private final String revision_;
   private final String filename_;

   public static final Type<ViewFileRevisionHandler> TYPE = new Type<ViewFileRevisionHandler>();
}