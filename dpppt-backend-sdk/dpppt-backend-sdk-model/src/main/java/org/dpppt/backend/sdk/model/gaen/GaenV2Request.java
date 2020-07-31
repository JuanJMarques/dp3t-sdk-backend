package org.dpppt.backend.sdk.model.gaen;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import ch.ubique.openapi.docannotations.Documentation;

public class GaenV2Request {
    @NotNull
    @NotEmpty
    @Valid
    @Documentation(description = "A list of iso-3166-1 alpha-2 country codes", example = "[\"CH\", \"DE\"]")
    List<@Size(max=2, min=2) String> countryCodes;

    @NotNull
    @NotEmpty
    @Valid
    @Size(min = 30, max = 30)
    @Documentation(description = "30 Temporary Exposure Keys - zero or more of them might be fake keys.")
    private List<GaenKey> gaenKeys;

    public List<GaenKey> getGaenKeys() {
        return this.gaenKeys;
    }

    public void setGaenKeys(List<GaenKey> gaenKeys) {
        this.gaenKeys = gaenKeys;
    }
}