/**
 *
 */
package de.hybris.platform.ycommercewebservicestest.test.groovy.webservicetests.v2.spock.misc

import static groovyx.net.http.ContentType.JSON
import static groovyx.net.http.ContentType.URLENC
import static groovyx.net.http.ContentType.XML
import static org.apache.http.HttpStatus.SC_OK

import de.hybris.bootstrap.annotations.ManualTest
import de.hybris.platform.ycommercewebservicestest.test.groovy.webservicetests.v2.spock.AbstractSpockFlowTest

import spock.lang.Unroll
import groovyx.net.http.HttpResponseDecorator

@ManualTest
@Unroll
/**
 *
 *
 */
class TitlesTest extends AbstractSpockFlowTest {

	def "Client retrieves available titles: #format"() {

		when:
		HttpResponseDecorator response = restClient.get(path: getBasePathWithSite() + '/titles', contentType: format)

		then:
		with(response) {
			if(isNotEmpty(data)&&isNotEmpty(data.errors))println(data)
			status == SC_OK
			isNotEmpty(data.titles)
			data.titles.size() > 0
		}

		where:
		format << [JSON, XML]
	}
}
