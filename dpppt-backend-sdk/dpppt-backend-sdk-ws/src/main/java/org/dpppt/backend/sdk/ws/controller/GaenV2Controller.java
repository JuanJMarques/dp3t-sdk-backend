package org.dpppt.backend.sdk.ws.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ch.ubique.openapi.docannotations.Documentation;

@Controller
@RequestMapping("/v2/gaen")
@Documentation(description = "The GAEN V2 endpoint for the mobile clients supporting international key sharing")
public class GaenV2Controller {

	/// POST für Keyupload

	/// GET fuer Key Download
	@GetMapping(path = "/exposed/{country}/{since}")
	@Documentation(description = "Requests the exposed keys published _since_ originating from _country_", responses = {
			"200 => zipped export.bin and export.sig of all keys in that interval",
			"404 => Invalid _country_ or invalid _since_ (too far in the past/future, not at bucket boundaries)" })
	public @ResponseBody ResponseEntity<byte[]> getExposedKeys(
			@Documentation(description = "Origin country of requested keys. (iso-3166-1 alpha-2)", example = "CH") @PathVariable String country,
			@Documentation(description = "Timestamp to retrieve exposed keys since, in milliseconds since Unix epoch (1970-01-01). It must indicate the beginning of a bucket.", example = "1593043200000") @PathVariable long since) {

		return null;
	}
}
