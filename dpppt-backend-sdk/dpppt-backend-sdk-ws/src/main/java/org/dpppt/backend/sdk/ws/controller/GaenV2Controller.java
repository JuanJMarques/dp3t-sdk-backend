package org.dpppt.backend.sdk.ws.controller;

import org.dpppt.backend.sdk.model.gaen.GaenV2Request;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ch.ubique.openapi.docannotations.Documentation;

@Controller
@RequestMapping("/v2/gaen")
@Documentation(description = "The GAEN V2 endpoint for the mobile clients supporting international key sharing")
public class GaenV2Controller {

	/// POST für Keyupload
	@PostMapping(value = "/exposed")
	@Documentation(description = "Endpoint used to upload exposure keys to the backend specifying for which countries the keys are valid.")
	public @ResponseBody ResponseEntity<String> addExposed(
			@Documentation(description = "JSON Object containing all keys and a list of countries specifying for which countries the keys are valid") @RequestBody GaenV2Request gaenV2Request) {

		return null;
	}

	/// GET fuer Key Download
	@GetMapping(value = "/exposed/{country}/{since}")
	@Documentation(description = "Requests the exposed keys published _since_ originating from _country_", responses = {
			"200 => zipped export.bin and export.sig of all keys in that interval",
			"404 => Invalid _country_ or invalid _since_ (too far in the past/future, not at bucket boundaries)" })
	public @ResponseBody ResponseEntity<byte[]> getExposedKeys(
			@Documentation(description = "Origin country of requested keys. (iso-3166-1 alpha-2)", example = "CH") @PathVariable String country,
			@Documentation(description = "Timestamp to retrieve exposed keys since, in milliseconds since Unix epoch (1970-01-01). It must indicate the beginning of a bucket.", example = "1593043200000") @PathVariable long since) {

		return null;
	}
}
