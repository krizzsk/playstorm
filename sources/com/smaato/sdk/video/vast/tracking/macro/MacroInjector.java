package com.smaato.sdk.video.vast.tracking.macro;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.collections.Maps;
import com.smaato.sdk.core.util.p382fi.BiFunction;
import com.smaato.sdk.video.utils.UriUtils;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class MacroInjector {
    private final AdBreakInfoMacros adBreakInfoMacros;
    private final CapabilitiesInfoMacro capabilitiesInfoMacro;
    private final ClickInfoMacros clickInfoMacros;
    private final ClientInfoMacros clientInfoMacros;
    private final ErrorInfoMacros errorInfoMacros;
    private final GenericMacros genericMacros;
    private final PlayerStateInfoMacros playerStateInfoMacros;
    private final PublisherInfoMacro publisherInfoMacro;
    private final RegulationInfoMacros regulationInfoMacros;
    private final UriUtils uriUtils;
    private final VerificationInfoMacros verificationInfoMacros;

    MacroInjector(UriUtils uriUtils2, AdBreakInfoMacros adBreakInfoMacros2, CapabilitiesInfoMacro capabilitiesInfoMacro2, ClientInfoMacros clientInfoMacros2, GenericMacros genericMacros2, PlayerStateInfoMacros playerStateInfoMacros2, PublisherInfoMacro publisherInfoMacro2, RegulationInfoMacros regulationInfoMacros2, VerificationInfoMacros verificationInfoMacros2, ClickInfoMacros clickInfoMacros2, ErrorInfoMacros errorInfoMacros2) {
        this.uriUtils = (UriUtils) Objects.requireNonNull(uriUtils2);
        this.adBreakInfoMacros = (AdBreakInfoMacros) Objects.requireNonNull(adBreakInfoMacros2);
        this.capabilitiesInfoMacro = (CapabilitiesInfoMacro) Objects.requireNonNull(capabilitiesInfoMacro2);
        this.clientInfoMacros = (ClientInfoMacros) Objects.requireNonNull(clientInfoMacros2);
        this.genericMacros = (GenericMacros) Objects.requireNonNull(genericMacros2);
        this.playerStateInfoMacros = (PlayerStateInfoMacros) Objects.requireNonNull(playerStateInfoMacros2);
        this.publisherInfoMacro = (PublisherInfoMacro) Objects.requireNonNull(publisherInfoMacro2);
        this.regulationInfoMacros = (RegulationInfoMacros) Objects.requireNonNull(regulationInfoMacros2);
        this.verificationInfoMacros = (VerificationInfoMacros) Objects.requireNonNull(verificationInfoMacros2);
        this.clickInfoMacros = (ClickInfoMacros) Objects.requireNonNull(clickInfoMacros2);
        this.errorInfoMacros = (ErrorInfoMacros) Objects.requireNonNull(errorInfoMacros2);
    }

    public String injectMacros(String str, PlayerState playerState) {
        return inject(str, createMacros(playerState));
    }

    public Set<String> injectMacros(Collection<String> collection, PlayerState playerState) {
        Map<String, String> createMacros = createMacros(playerState);
        HashSet hashSet = new HashSet(collection.size());
        for (String inject : collection) {
            hashSet.add(inject(inject, createMacros));
        }
        return hashSet;
    }

    private String inject(String str, Map<String, String> map) {
        return (String) Maps.reduce(map, str, new BiFunction() {
            public final Object apply(Object obj, Object obj2) {
                return MacroInjector.this.lambda$inject$0$MacroInjector((Map.Entry) obj, (String) obj2);
            }
        });
    }

    public /* synthetic */ String lambda$inject$0$MacroInjector(Map.Entry entry, String str) {
        return str.replace((CharSequence) entry.getKey(), this.uriUtils.encodeQueryString((String) entry.getValue()));
    }

    private Map<String, String> createMacros(PlayerState playerState) {
        return Maps.merge(this.adBreakInfoMacros.toMap(playerState), this.capabilitiesInfoMacro.toMap(), this.clientInfoMacros.toMap(), this.genericMacros.toMap(), this.playerStateInfoMacros.toMap(playerState), this.publisherInfoMacro.toMap(), this.regulationInfoMacros.toMap(), this.verificationInfoMacros.toMap(), this.clickInfoMacros.toMap(playerState.clickPositionX, playerState.clickPositionY), this.errorInfoMacros.toMap(playerState.errorCode));
    }
}
