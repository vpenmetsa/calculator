/**
 * 
 */
package examples.servlet;

import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.nullable;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for CalculatorServlet
 *
 * @see examples.servlet.CalculatorServlet
 * @author vpenmetsa
 */
public class CalculatorServletTest {

	/**
	 * Parasoft Jtest UTA: Test for doGet(HttpServletRequest, HttpServletResponse)
	 *
	 * @see examples.servlet.CalculatorServlet#doGet(HttpServletRequest, HttpServletResponse)
	 * @author vpenmetsa
	 */
	@Test
	public void testDoGet() throws Throwable {
		// Given
		CalculatorServlet underTest = new CalculatorServlet();

		// When
		HttpServletRequest request = mockHttpServletRequest();
		HttpServletResponse response = mockHttpServletResponse();
		underTest.doGet(request, response);

		// Then - assertions for this instance of CalculatorServlet
		assertNull(underTest.getServletConfig());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of HttpServletRequest
	 */
	private static HttpServletRequest mockHttpServletRequest() throws Throwable {
		HttpServletRequest request = mock(HttpServletRequest.class);
		String getParameterResult = "3"; // UTA: default value
		when(request.getParameter(nullable(String.class))).thenReturn(getParameterResult);
		return request;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of HttpServletResponse
	 */
	private static HttpServletResponse mockHttpServletResponse() throws Throwable {
		HttpServletResponse response = mock(HttpServletResponse.class);
		PrintWriter getWriterResult = mock(PrintWriter.class);
		when(response.getWriter()).thenReturn(getWriterResult);
		return response;
	}

	/**
	 * Parasoft Jtest UTA: Test cloned from
	 * examples.servlet.CalculatorServletTest#testDoGet()
	 * Hint: To cover the code, the 'PROCESS_ADD.equals(sProcess)' method must return 'true'.
	 *
	 * @see examples.servlet.CalculatorServlet#doGet(HttpServletRequest, HttpServletResponse)
	 * @author vpenmetsa
	 */
	@Test
	public void testDoGet2() throws Throwable {
		// Given
		CalculatorServlet underTest = new CalculatorServlet();

		// When
		HttpServletRequest request = mockHttpServletRequest();
		HttpServletResponse response = mockHttpServletResponse();
		underTest.doGet(request, response);

	}
}