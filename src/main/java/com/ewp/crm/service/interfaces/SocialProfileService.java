package com.ewp.crm.service.interfaces;

import com.ewp.crm.models.Client;
import com.ewp.crm.models.SocialProfile;

import java.util.List;
import java.util.Optional;

public interface SocialProfileService {

	SocialProfile getSocialProfileByLink(String link);

	Optional<SocialProfile> getSocialProfileByClientIdAndTypeName(long clientId, String profileName);
}
