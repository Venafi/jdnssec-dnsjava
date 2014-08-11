// Copyright (c) 2003-2004 Brian Wellington (bwelling@xbill.org)

package org.xbill.DNS;

/**
 * An exception thrown when an invalid TTL is specified.
 *
 * @author Brian Wellington
 */

public class InvalidTTLException extends IllegalArgumentException {

  private static final long serialVersionUID = 1L;

  public InvalidTTLException(long ttl) {
    super("Invalid DNS TTL: " + ttl);
  }

}
