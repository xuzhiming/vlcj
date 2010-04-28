/*
 * This file is part of VLCJ.
 *
 * VLCJ is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * VLCJ is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with VLCJ.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Copyright 2009, 2010 Caprica Software Limited.
 */

package uk.co.caprica.vlcj.runtime.windows;

import com.sun.jna.platform.win32.Advapi32Util;
import com.sun.jna.platform.win32.WinReg;

/**
 * Windows specific run-time utilities.
 */
public class WindowsRuntimeUtil {

  /**
   * The VLC registry key, under HKLM.
   */
  public static final String VLC_REGISTRY_KEY = "SOFTWARE\\VideoLAN\\VLC";
  
  /**
   * The VLC registry key for the installaton directory.
   */
  public static final String VLC_INSTALL_DIR_KEY = "InstallDir";
  
  /**
   * Get the VLC installation directory.
   * 
   * @return fully-qualified directory name
   */
  public static String getVlcInstallDir() {
    return Advapi32Util.registryGetStringValue(WinReg.HKEY_LOCAL_MACHINE, VLC_REGISTRY_KEY, VLC_INSTALL_DIR_KEY);
  }
}