/*
 * Copyright (c) Microsoft. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */
package com.microsoft.azure.servicebus;

public class IllegalConnectionStringFormatException extends IllegalArgumentException
{

	IllegalConnectionStringFormatException()
	{
	}

	IllegalConnectionStringFormatException(String detail)
	{
		super(detail);
	}

	IllegalConnectionStringFormatException(Throwable cause)
	{
		super(cause);
	}

	IllegalConnectionStringFormatException(String detail, Throwable cause)
	{
		super(detail, cause);
	}

}
